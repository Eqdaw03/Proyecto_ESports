
#! /bin/bash

g1="10.1.1.1" #Grupo 1
g2="10.1.2.1" #Grupo 2
g3="10.1.3.1" #Grupo 3
g4="10.1.11.1" #Grupo 4
g5="10.1.10.1" #Grupo 5
i="8.8.8.8" #Internet

ip=("$g1" "$g2" "$g3" "$g4" "$g5" "$i") #Array de los grupos e internet

for item in ${ip[*]} #For para hacer ping a todas las ips del array
do
ping -c 4 $item

if [ "$?" != "0" ] ; then   #Si hay un ploblema a la hora de hacer ping salta a este if
   if [ "$item" = "8.8.8.8" ] ; then (echo -n "Sin conexion a internet con la IP = $item, dia : " ; date) >> /var/log/noping$
        echo "Problemas de conexion a internet"
        else
   (echo -n "Error de conexion con la IP = $item, dia :  " ; date) >> /var/log/noping.log #Problemas con algunas de las ips $
   echo -e     "${item} !!! \e[0;31m[X]\e[1;37m" #Mensaje X personalizado con colores
        echo "Problemas con alguna ip de los grupos"
        fi
 else echo -e  "$item \e[1;32m[OK]\e[1;37m" #Mensaje OK personalizado con colores
 fi
done




