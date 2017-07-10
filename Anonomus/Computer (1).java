interface Specification
{
    int WINDOWS = 1;
    int LINUX = 2;
    int MAC = 3;
    int OTHERS = 4;
    
   interface HDD
   {
        class HSpace 
        {
        static int Disk_Space = 512;
        static int Free_Space = 200;
        static int Used_Space = Disk_Space - Free_Space;
        static int i = 300;

            public HSpace(int i)
            {
               this.i = i;
            }
       
            static void Display()
            {
            System.out.println("Gathering Requirements....\n");

                class Local
                {

                    public Local()
                    {
                        new HSpace(1200);
                        System.out.println("Calculating Size...");
                    }

                }
                new Local();
            }

          static int getJ()
            {
                return i;
            }

               interface Compute
               {
                int w = 4;

                    class InnerFace
                    {
                     static int z = 10000;
                    }
               }
        } 
        class OSpace
        {
        String Computer_Name;
        String OsType;
        String OS_Version;
        }
    
	int getDiskSpace();
	int getFreeSpace();
	int getUsedSpace();
    String getComputerName();
    String getOsType();
    String getOsVersion();
   }

	interface RAM
	{
	 	class Size
	    {
	    int RAM_Size;
        int InstalledTime;
		}   

	 int getRAM();
	}
		interface GraphicsCard
		{
			class GraphicsSpec
			{
            int GSize;
		    String Gname;
            String Processer_Name;
			}
		int getGrapicsSize();
    	String getCardName();
        String getProcessName();
		}

				interface Monitor
				{
					class MonitorType
					{
					String MonitorName;
               		String Resolution;
				    String MonitorSize;
					}
				String getMonitorName();
				int getResolution();
				int getMonitorSize();
    			}
}

public class Computer implements Specification
{
    int currentTime;
    int LogginTime;
    int LoggoutTime;
    int installedApp;
    int newlyInstalledApp;
       
  public Computer()
  {
     System.out.println("\n");
     System.out.println("\tMy Computer");
     System.out.println("\t-----------\n");
  }

  int getDiskSpace()
  {
      Specification.HDD.HSpace.Display();
      System.out.println("Calculating Disk Space" + " " + Specification.HDD.HSpace.Compute.w + "GB");
      System.out.println("Calculating Disk Space" + " " + Specification.HDD.HSpace.Compute.InnerFace.z + "GB");
      return 0;
  }

  int getFreeSpace()
  {
    System.out.println("Calculating Free Space" + " " + Specification.HDD.HSpace.Free_Space);
    return 0;
  }

  int getUsedSpace()
  {
    System.out.println("Calculating Used Space" + " " + Specification.HDD.HSpace.Used_Space);
    return 0;
  }

  int getB()
  {

   System.out.println("Calculating Used Space" + " " +  Specification.HDD.HSpace.getJ());
   return 0;
  }

  

	public static void main(String[] args)
    {
         Computer C=new Computer();
         C.getDiskSpace();
         C.getFreeSpace();
         C.getUsedSpace();
         C.getB();

    }

}
