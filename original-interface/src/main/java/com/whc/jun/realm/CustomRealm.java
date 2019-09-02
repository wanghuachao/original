package com.whc.jun.realm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.util.StringUtils;

public class CustomRealm extends AuthorizingRealm {

  Map<String, String> userMap = new HashMap<>();

  {
    userMap.put("张三", "123456");
    userMap.put("王五", "666666");
    super.setName("customRealm");
  }
  /**
   * 授权
   *
   * @param principalCollection
   * @return
   */
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    String username = (String) principalCollection.getPrimaryPrincipal();
    Set<String> roles = getRolesByUserName(username);

    Set<String> permissions = getPermissionsByUserName(username);

    SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
    authorizationInfo.setRoles(roles);
    authorizationInfo.setStringPermissions(permissions);

    return authorizationInfo;
  }

  /**
   * 认证
   *
   * @param authenticationToken
   * @return
   * @throws AuthenticationException
   */
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
      throws AuthenticationException {
    // 1。从主体传过来的认证信息中获取用户名
    String username = (String) authenticationToken.getPrincipal();
    // 2.通过用户名到数据库中获取密码
    String password = getPassWordByUserName(username);

    if (StringUtils.isEmpty(password)) {
      return null;
    }
    SimpleAuthenticationInfo authenticationInfo =
        new SimpleAuthenticationInfo(username, password, "customRealm");
    return authenticationInfo;
  }

  /**
   * 模拟从数据库中通过用户名获取密码
   *
   * @param username
   * @return
   */
  private String getPassWordByUserName(String username) {
    return userMap.get(username);
  }

  private Set<String> getRolesByUserName(String username) {
    Set<String> roles = new HashSet<>();
    roles.add("admin");
    roles.add("user");
    return roles;
  }

  private Set<String> getPermissionsByUserName(String username) {
    Set<String> permissions = new HashSet<>();
    permissions.add("user:delete");
    permissions.add("user:add");
    return permissions;
  }
}
