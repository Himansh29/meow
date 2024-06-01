echo "enter age"
read age
if [ $age -lt 5 ]
then
	echo "you are in kinder garden"
elif [ $age -ge 5 -a  $age -le 12 ]
then
     echo "you are in primary schol"
elif [ $age -le 16 ]
then
    echo "you are in high scool"
else
    echo "you are in college"
    echo "or you may be working"
fi    
