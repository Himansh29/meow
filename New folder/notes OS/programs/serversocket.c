#include <sys/types.h>
#include <sys/socket.h>
#include <stdio.h>
#include <sys/un.h>
#include <unistd.h>
int main()
{
int server_sockfd, client_sockfd;
int server_len, client_len;
struct sockaddr_un server_address;
struct sockaddr_un client_address;
//2.Remove any old socket and create an unnamed socket for the server.
unlink("server_socket");
server_sockfd = socket(AF_UNIX, SOCK_STREAM, 0);
//3.
//Name the socket.
server_address.sun_family = AF_UNIX;
strcpy(server_address.sun_path, "server_socket");
server_len = sizeof(server_address);
bind(server_sockfd, (struct sockaddr *)&server_address, server_len);
//4.
//Create a connection queue and wait for clients.
listen(server_sockfd, 5);
while(1) {
char ch;
printf("server waiting\n");
//5.
//Accept a connection. 
client_len = sizeof(client_address);
client_sockfd = accept(server_sockfd,
(struct sockaddr *)&client_address, &client_len);
//6.Read and write to client on client_sockfd.
read(client_sockfd, &ch, 1);
ch++;
write(client_sockfd, &ch, 1);
close(client_sockfd);
}
}
