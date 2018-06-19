package mypkg;

public class CalGeneralCategory extends CStudent{
	  public CalGeneralCategory()
	  {
	    sName=" ";
	    nAdno=0;
	    mathsMark1=0;
	    physicsMark1=0;
	    chemistryMark1=0;
	    entMark1=0;
	    bonus=0;
	  }
	  public CalGeneralCategory(String sName1,int nAdno1,double mathsMark,double physicsMark,double chemistryMark,double entMark)
	  {
	    super(sName1,nAdno1,mathsMark,physicsMark,chemistryMark,entMark);
	  }
	  public double calCutoff(int bonus)
	  {
	   bonus=0;
	   cutoff=(mathsMark1*0.50)+((physicsMark1*0.25)+(chemistryMark1*0.25))/2+(entMark1*0.25)+bonus;
	   return cutoff;
	  }
	  public void Display()
	  {
	    System.out.println("The cutoff is:"+cutoff);
	  }

}
