/**
 **/
package test;


/**
 **/
public interface ChatFacadeInterface {
   //
   // Methods 
   //

   /**
    * Queryvoisins
    * null
    * @param expeditor is the component name who sent this message
    **/
   public  void ReceiveQueryVoisins(String expeditor, java.lang.String parameter);

   /**
    * disconnect
    * disconnect
    * @param expeditor is the component name who sent this message
    **/
   public  void disconnectInput(String expeditor);

   /**
    * chat
    * null
    * @param expeditor is the component name who sent this message
    **/
   public  void input(String expeditor, java.lang.String parameter);

   /**
    * query
    * null
    * @param expeditor is the component name who sent this message
    **/
   public  void receiveQuery(String expeditor, java.lang.String initiator, java.lang.Integer id, java.lang.String request, java.lang.Integer ttl);

   /**
    * quit
    * quit
    * @param expeditor is the component name who sent this message
    **/
   public  void quit(String expeditor);

   /**
    * queryAnswer
    * null
    * @param expeditor is the component name who sent this message
    **/
   public  void receiveQueryAnswer(String expeditor, java.lang.Integer id, java.lang.String answer);

   /**
    * voisins
    * null
    * @param expeditor is the component name who sent this message
    **/
   public  void getVoisins(String expeditor, java.util.ArrayList voisins);

   /**
    * shutdown
    * shutdown
    * @param expeditor is the component name who sent this message
    **/
   public  void shutdown(String expeditor);

   /**
    * requestInitData
    * 
    * @param expeditor is the component name who sent this message
    **/
   public  Object requestTree(String expeditor);

   /**
    * Queryvoisins
    * null
    **/
   public  void addQueryvoisinsListener(QueryvoisinsListener data);

   /**
    * Queryvoisins
    * null
    **/
   public  void removeQueryvoisinsListener(QueryvoisinsListener data);

   /**
    * disconnect
    * 
    **/
   public  void addDisconnectListener(DisconnectListener data);

   /**
    * disconnect
    * 
    **/
   public  void removeDisconnectListener(DisconnectListener data);

   /**
    * initData
    * 
    **/
   public  void addInitDataListener(InitDataListener data);

   /**
    * initData
    * 
    **/
   public  void removeInitDataListener(InitDataListener data);

   /**
    * log
    * 
    **/
   public  void addLogListener(LogListener data);

   /**
    * log
    * 
    **/
   public  void removeLogListener(LogListener data);

   /**
    * query
    * null
    **/
   public  void addQueryListener(QueryListener data);

   /**
    * query
    * null
    **/
   public  void removeQueryListener(QueryListener data);

   /**
    * queryAnswer
    * null
    **/
   public  void addQueryAnswerListener(QueryAnswerListener data);

   /**
    * queryAnswer
    * null
    **/
   public  void removeQueryAnswerListener(QueryAnswerListener data);

   /**
    * voisins
    * null
    **/
   public  void addVoisinsListener(VoisinsListener data);

   /**
    * voisins
    * null
    **/
   public  void removeVoisinsListener(VoisinsListener data);

   /**
    * exit
    * 
    **/
   public  void addExitListener(ExitListener data);

   /**
    * exit
    * 
    **/
   public  void removeExitListener(ExitListener data);

   /**
    * undo
    * 
    **/
   public  void addUndoListener(UndoListener data);

   /**
    * undo
    * 
    **/
   public  void removeUndoListener(UndoListener data);

   /**
    * logUndo
    * 
    **/
   public  void addLogUndoListener(LogUndoListener data);

   /**
    * logUndo
    * 
    **/
   public  void removeLogUndoListener(LogUndoListener data);

   /**
    * chat
    * null
    **/
   public  void addChatListener(ChatListener data);

   /**
    * chat
    * null
    **/
   public  void removeChatListener(ChatListener data);

   /**
    * connectTo
    * 
    **/
   public  void addConnectToListener(ConnectToListener data);

   /**
    * connectTo
    * 
    **/
   public  void removeConnectToListener(ConnectToListener data);

   /**
    * send
    * 
    **/
   public  void addSendListener(SendListener data);

   /**
    * send
    * 
    **/
   public  void removeSendListener(SendListener data);


}
