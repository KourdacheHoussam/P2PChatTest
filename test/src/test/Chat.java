package test;

import inria.scifloware.sciflowarecomponent.command.Command;
import inria.smarttools.core.component.PropertyMap;

import java.util.ArrayList;

import test.view.IChatView;

import javax.swing.SwingUtilities;

import test.view.ChatFrame;

public abstract class Chat extends inria.scifloware.sciflowarecomponent.SciflowareComponentFacade {

	protected ArrayList<String> neighbours=new ArrayList<String>();
	protected IChatView view = null;
	protected ArrayList<Integer> QueriesId = new ArrayList<Integer>();
	
	

	//constructeur
	public Chat () {
		Command Recherche = new Command() {
			@Override
			public void execute(){				
				// Va envoyer une query pour les voisins de ses voisins
				getView().SearchNewNeighbours();
				getView().addConnu(neighbours);				
			}
		};		
		// Execute la query de recherche de voisins et affichage toutes les 10 secs
		trigger(10000, Recherche, true);
	}

	
	
	//Input Image
	public void imageInput(String expeditor, java.lang.String imageparameter){
		getView().messageArrived(expeditor, imageparameter);
	}	
	//OutPut Image
	public abstract void imageOutput(java.lang.String imageparameter);
	public abstract void imageOutput( String destination, java.lang.String image_parameter);

	
	public void input( String expeditor, java.lang.String parameter) {
		getView().messageArrived(expeditor, "Hey  Hey :   " + parameter );		
	}
	
	public abstract void output( java.lang.String parameter);

	/** ---------------------------------------------------------------------- **/
	
	public abstract void output( String destination, java.lang.String parameter);
	
	/** ---------------------------------------------------------------------- **/

	public IChatView getView() {
		if (view == null) {
			view = new ChatFrame(this);
		}
		return view;
	}

	/** ---------------------------------------------------------------------- **/

	@Override
	protected void neighbourJustConnected(String name, String service) {
		if (service.equals("chat")) {
			System.out.println(getIdName() + " can now talk to " + name);
			getView().msg("/**** " +getIdName() + " peut maintenant parler a " + name + " ****/");
			getView().addNeighbour(name);
			// Ajoute aussi le nouveau connecté dans neighboors
			if (!neighbours.contains(name))
			neighbours.add(name);
		}
	}
	
	/** ---------------------------------------------------------------------- **/
	
	public void disconnectInput(String expeditor) {
		// TODO Auto-generated method stub
		
	}

	/** ---------------------------------------------------------------------- **/
	
	public void shutdown(String expeditor) {
		// TODO Auto-generated method stub
		
	}


	/** ---------------------------------------------------------------------- **/
	
	public Object requestTree(String expeditor) {
		// TODO Auto-generated method stub
		return null;
	}


	/** ---------------------------------------------------------------------- **/
	
	public void quit(String expeditor) {
		// TODO Auto-generated method stub
		
	}


	

	/** ---------------------------------------------------------------------- **/
	
	public void addID(Integer id) {
		// Permet de stocker les ID de requetes déja traitées
		QueriesId.add(id);
	}
	
	
	/** ---------------------------------------------------------------------- **/
	
	// Méthode appellée quand le composant SON est pret
	@Override
	public void InitOn(){
		super.InitOn();		
		// Initilisation de la vue quand le composant est prï¿½t
		if (view == null) {
			view = new ChatFrame(this);
		}
	}

	/** ---------------------------------------------------------------------- **/
	
	/** 
	 * """"""""""""""""
	 * """""  1 """""""
	 * """"""""""""""""
	 * @param expeditor
	 * @param parameter
	 */
	
	public void ReceiveQueryVoisins(String expeditor, String parameter) {
			
	}

	/** ---------------------------------------------------------------------- **/
	
	/** 
	 * """"""""""""""""
	 * """""  2 """""""
	 * """"""""""""""""
	 */
	public void getVoisins(String expeditor, ArrayList<String> voisins) {		
		// Recupere la liste des voisins du voisin
		for (int i=0;i<voisins.size();i++){
			if (!neighbours.contains(voisins.get(i)) && voisins.get(i)!=this.getIdName())
					{
						neighbours.add(voisins.get(i));
					}
		}		
	}

	
	
		/** ---------------------------------------------------------------------- **/
	
	public abstract void sendVoisins( ArrayList<String> voisins);
	
	/** ---------------------------------------------------------------------- **/

	public abstract void sendVoisins( String destination, ArrayList<String> voisins);

	/** ---------------------------------------------------------------------- **/
	
	public abstract void SendQueryVoisins( java.lang.String parameter);
	
	/** ---------------------------------------------------------------------- **/

	public abstract void SendQueryVoisins( String destination, java.lang.String parameter);

	
	
	
	/** ---------------------------------------------------------------------- **/
	/**
	 * 
	 * """"""""""""""""
	 * """""  4 """""""
	 * """"""""""""""""
	 * @param expeditor
	 * @param initiator
	 * @param id
	 * @param request
	 * @param ttl
	 */
	public void receiveQuery(String expeditor, String initiator, Integer id,
			String request, Integer ttl) {
		
		// Connection a l'initiateur
		//connectTo("ComponentsManager", getIdName() , null, initiator, "", "", "", new PropertyMap());
	}
	
	/** ---------------------------------------------------------------------- **/
	
	/**
	 *  
	 * """"""""""""""""
	 * """""  5 """""""
	 * """"""""""""""""
	 * @param adressee
	 * @param initiator
	 * @param id
	 * @param request
	 * @param ttl
	 */
	
	
	public abstract void sendQuery(String adressee, String initiator, Integer id,
			String request, Integer ttl);
	
	/** ---------------------------------------------------------------------- **/
	/**
	 * * """"""""""""""""
	 * """""  6 """""""
	 * """"""""""""""""
	 * @param expeditor
	 * @param id
	 * @param answer
	 */
	public void receiveQueryAnswer(String expeditor, Integer id, String answer) {
		// Query Answer
		
	}	
	
	/** ---------------------------------------------------------------------- **/

	/**
	 * """"""""""""""""
	 * """""  7 """""""
	 * """"""""""""""""
	 * @param adressee
	 * @param id
	 * @param answer
	 */
	public abstract void sendQueryAnswer(String adressee, Integer id, String answer);


}
