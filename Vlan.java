-VLAN Server 

en
vlan database
vlan numero_aqui name nombre_aqui
exit

en
conf t
hostname sw1
vtp mode server
vtp domain final3.edu.mx
vtp password abc789

- TRUNK -- coneccion entre los enlaces de los swiches
en
conf t
int range f0/1
sw mode trunk
exit

-PC ACCESO
en
conf t
int f0/1
sw mode acces 
sw acces vlan numero_aqui


-CLIENTE

en
conf t
hostname sw2
vtp mode client
vtp domain final3.edu.mx

- TRUNK

en
conf t
int range f0/1-2
sw mode trunk
exit

int f0/1
sw mode trunk
exit

-PC ACCESO

int f0/3
sw mode acces 
sw acces vlan numero_aqui


-IP VLAN
en
conf t
int vlan numero_aqui 
ip add xx.xx.xx.xx la_mascara


-STP
sw1: spanning-tree vlan 1 root primary
sw2: spanning-tree vlan 1 root secondary

sh spanning-tree //Ver spanning-tree

Sw1(config)# spanning-tree vlan 1-2 priority 0
Sw2(config)# spanning-tree vlan 1-2 priority 4096

//1,3-5,7,9-11 -> las vlan 1,3,4,5,7,9,10 y 11. 

ROUTER ->
