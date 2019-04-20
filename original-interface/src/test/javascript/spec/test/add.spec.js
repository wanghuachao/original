define(['test/add'],function(add){
    describe('test/add', function() {
        it('add', function() {
            var a = 3;
            var b = 5;
            var result = add.add(a, b);
            expect(result).toEqual(8);
        });
    });
})