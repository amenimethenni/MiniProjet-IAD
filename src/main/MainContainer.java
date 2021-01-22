package main;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;


//Cette classe est proposée par l'etudiante Ameni Methenni

public class MainContainer {
	
	  public static void main(String[] args) throws Exception {
		  
		  Runtime runtime = Runtime.instance();
		  
		  ProfileImpl configuration = new ProfileImpl();
		  //configuration.setParameter("gui", "true");
		  configuration.setParameter(ProfileImpl.GUI, "true");
		  AgentContainer mainContainer = runtime.createMainContainer(configuration);
		  mainContainer.start();
		  
	  }

}
