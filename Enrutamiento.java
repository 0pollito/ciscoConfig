-EN EL ROUTER

-EIGRP

en
conf t
router eigrp num-sistematico
network ip-vecino

exit 
exit



-RIP
en
conf t
router rip
version 2
network ip-vecino

exit
exit

-OSPF

en
conf t
route ospf numero-sistematico
network ip-vecino mascara a el-area
exit

-STATIC

en
conf t
ip route ip-otra-red masc-otra-red puertoSerial-mio-sale
 
ip route 18.10.7.0 255.255.255.128 s2/0


==================================================================================================================================
/*
passive-interface fastethernet 0/0 >no actualiza abajo
redistribute static
*/


ppp-chap-pap ->
password ->