function covls(str){
    let count =0;
    for(var i of str)
    {
        if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
        {
            count+=1;
        }
        else if(i=='A'||i=='E'||i=='I'||i=='U'||i=='O')
        {
            count+=1;
        }
        else
        {
            count+=0;
        }
    }

    console.log("The ovel count is:"+count);
    return count;
}

let string="hari krishna prasaad";
console.log("The no of ovels is:"+covls(string));