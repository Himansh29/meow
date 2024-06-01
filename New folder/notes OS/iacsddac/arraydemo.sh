for((i=0;i<10;i++)){
   echo "enetr number"
   read num
   data[$i]=$num

}

s=0
for((i=0;i<10;i++)){
   let s=s+${data[$i]}

}
echo  "sum : $s"
echo ${data[*]}
