let grd=prompt("Enter the percentage");
if(grd<=100 &&grd>=85){
    console.log("first class");
}
else if(grd<85 &&grd>=75){
    console.log("second class");
}
if(grd<75 &&grd>=65){
    console.log("third class");
}
if(grd<65 &&grd>=35){
    console.log("pass");
}
else{
    console.log("fail");
}