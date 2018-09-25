en
conf t
enable password A1c3
line console 0
password C0n5
login
exit
line vty 0 4
password 4wA1
login
exit
service password-encryption
banner motd %Acceso restringo%