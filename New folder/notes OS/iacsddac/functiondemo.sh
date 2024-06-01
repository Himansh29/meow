printtable(){
   n=$1
   for((i=1;i<11;i++)){
     a=`expr $n \* $i`
     echo "$n X $i = $a " 
   }

}


echo "enter number"
read num
printtable $num
echo "enter number"
read num1
printtable $num1

