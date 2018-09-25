-ROUTER

en
conf t
hostname MEX

int f0/0
description "*****"
no sh





se0/0/0

int f0/0.num_vlan
encapsulation dot1q num_vlan
ip add ip_del_router la_mascara


int s2/0
ip add ip_delrouter la_mascara
clock rate 56000 
no sh
exit

Enrutamiento ->