# Connector VMware
This connector plug a VMware infrastructure with infrastructure extension, CRTP (OCCI resource template) and VMware extension.

## How to use this connector 
For use, you must declare in classpath the vmware extension, CRTP extension, infrastructure extension.

<b>vmware</b> extension is the extension model for this connector, you can design a vmware instance and launch it on VMware vCenter.

Two modes are supported, the creation of virtual machine without virtual machine template and with a template.

Usage with template : set the attribute "imagename" with the name of your template and the connector will clone the template on your compute without taking account of other fields (like cpu, memory etc.), set the title as it represent the name of your virtual machine.

Don't forget to add your credentials in src/resources/vmware-credential.properties and copy it to your home directory before using this connector.

Disk usage has been added, you can create empty disk, create attached disk, attach/detach a disk, delete a disk, resize a disk (only on superior capacity) and rename a disk.

Network usage has been added, you can now discover networks, the vswitch networking actions is in development. You can create network adapters and connect or disconnect them.

## Supported version of VMware vCenter
The version 6.0, and all older version 5.5, 5.0, 4.1 etc. (ESX and ESXi).
