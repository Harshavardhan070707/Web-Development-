let arr=[1,2,3,4,5];
let sum=0;
console.log("The array elements are:")
for(let val of arr){
    console.log(val);
}
for(let val of arr){
    sum+=val;
}
console.log("Total sum of array elements is:"+sum);
console.log("Avarage of array elements is:"+sum/arr.length);

