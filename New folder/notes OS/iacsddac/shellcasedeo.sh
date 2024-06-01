echo "1. create directory"
echo "2. create file"
echo "3. delete file"
echo "choice : "
read choice
case $choice in
	1)echo "enter directory name"
	   read dn
	   if [ -d $dn ]
	   then
		   echo "directory exists"
           else
		   mkdir $dn
		   echo "directory created"
	   fi;;
        2)echo "enter file name"
	  read fn
	  if [ -f $fn ]
	  then
               echo "do you want to overrite"
	       read ans
               if [ $ans = "y" ]
	       then
		       cat > $fn
		       echo "overriten"
	       else
		       echo "file exists"
	       fi
	   else
		   cat>$fn
		   echo "file created"
           fi;;
     3);;
     *)exit;;
esac

