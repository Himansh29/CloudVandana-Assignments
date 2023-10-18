function sortArrayDescending(arr) {
    arr.sort(function(a, b) {
        return b - a; 
    });
}

const numbers = [4, 2, 8, 1, 6, 9];
sortArrayDescending(numbers);
console.log(numbers); 
