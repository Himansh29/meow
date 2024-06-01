#include<stdio.h>
#include<unistd.h>
#include<string.h>
#include <sys/types.h>
#include <sys/wait.h>

int main()
{
	pid_t pid;

	int fd[2];

	int status = pipe(fd);
	
	if (status < 0)
	{
		printf("pipe failed\n");
		return -1;
	}

	x = fork();

	if (x < 0)
	{
		return -1; // fork failed
	}

	if (x > 0) //parent
	{
		char str1[100];
		close(fd[0]);

		printf("Enter data\n");
		scanf("%s", str1);

		write(fd[1], str1, strlen(str1)+1);
		close(fd[1]);
	}
	else //child
	{
//		waitpid(pid, NULL, 0);
		char str1[100];
		close(fd[1]);
		read(fd[0], str1, sizeof(str1));
		printf("Child sent data : %s\n", str1);
		close(fd[0]);
	}

	return 0;

}
