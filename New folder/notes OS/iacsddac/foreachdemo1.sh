cnt=0
for i in *.sh #  a.sh b.sh foreachdemo123.sh
do
  if [ $i !=  $0  ]
  then
     let cnt=cnt+1	
  fi

done
echo "number of sh files are $cnt"
