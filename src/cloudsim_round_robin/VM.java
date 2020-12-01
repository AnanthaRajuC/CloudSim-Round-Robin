package cloudsim_round_robin;

import java.util.LinkedList;
import java.util.List;

import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Vm;

public class VM 
{
	public List<Vm> createVM(int userId, int vms, int idShift) 
	{
		//Creates a container to store VMs. This list is passed to the broker later
		LinkedList<Vm> vmList = new LinkedList<Vm>();

		//VM Parameters
		long size = 10000; //image size (MB)
		int ram = 512; //vm memory (MB)
		int mips = 250;
		long bw = 1000;
		int pesNumber = 1; //number of cpus
		String vmm = "Xen"; //VMM name

		//create VMs
		Vm[] vm = new Vm[vms];

		for(int i=0;i < vms;i++)
		{
			vm[i] = new Vm(idShift + i, userId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());
			vmList.add(vm[i]);
		}

		return vmList;
	}
}
