factorial(){
n=$1
fact=1
for ((i=1;i<=n;i++)){
    let fact=fact*$i  

}
echo "Factorial : $fact"
return 0
}



echo "calaculate factorial of num $1"
factorial $1

