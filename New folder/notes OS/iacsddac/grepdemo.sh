if [ $# -eq 2 ]
then
        if grep $1 $2>/dev/null
	then 
		echo "pattern found"
	else
		echo "pattern not found"
	fi
else
	echo "too feww arguments pls. enter 2 arguments"
fi
