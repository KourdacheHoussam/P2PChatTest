/**
 **/
package test;

import inria.scifloware.sciflowarecomponent.SciflowareComponentContainer;
import java.util.List;
import java.util.ArrayList;
import inria.smarttools.core.component.*;
import java.lang.String;
import inria.smarttools.core.component.PropertyMap;
import java.lang.Integer;

/**
 **/
public class ChatContainer extends SciflowareComponentContainer implements inria.smarttools.core.component.Container, test.QueryvoisinsListener, test.DisconnectListener, test.InitDataListener, test.LogListener, test.QueryListener, test.QueryAnswerListener, test.VoisinsListener, test.ExitListener, test.UndoListener, test.LogUndoListener, test.ChatListener, test.ConnectToListener, test.SendListener {
   {
      List<MethodCall> methodCalls;
      methodCalls = calls.get("Queryvoisins");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("Queryvoisins", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            ((ChatFacade) facade).ReceiveQueryVoisins(expeditorId, (java.lang.String) parameters.get("parameter"));
            return null;
         	}});
      methodCalls = calls.get("disconnect");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("disconnect", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            ((ChatFacade) facade).disconnectInput(expeditorId);
            return null;
         	}});
      methodCalls = calls.get("chat");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("chat", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            ((ChatFacade) facade).input(expeditorId, (java.lang.String) parameters.get("parameter"));
            return null;
         	}});
      methodCalls = calls.get("query");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("query", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            ((ChatFacade) facade).receiveQuery(expeditorId, (java.lang.String) parameters.get("initiator"), (java.lang.Integer) parameters.get("id"), (java.lang.String) parameters.get("request"), (java.lang.Integer) parameters.get("ttl"));
            return null;
         	}});
      methodCalls = calls.get("quit");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("quit", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            ((ChatFacade) facade).quit(expeditorId);
            return null;
         	}});
      methodCalls = calls.get("queryAnswer");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("queryAnswer", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            ((ChatFacade) facade).receiveQueryAnswer(expeditorId, (java.lang.Integer) parameters.get("id"), (java.lang.String) parameters.get("answer"));
            return null;
         	}});
      methodCalls = calls.get("voisins");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("voisins", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            ((ChatFacade) facade).getVoisins(expeditorId, (java.util.ArrayList) parameters.get("voisins"));
            return null;
         	}});
      methodCalls = calls.get("shutdown");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("shutdown", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            ((ChatFacade) facade).shutdown(expeditorId);
            return null;
         	}});
      methodCalls = calls.get("requestInitData");
      if (methodCalls == null) {
         methodCalls = new ArrayList<MethodCall>();
         calls.put("requestInitData", methodCalls);
      }
      methodCalls.add(new MethodCall() {
         public Object call(ContainerProxy expeditor, String expeditorId, String expeditorType, PropertyMap parameters) {
            Object res = ((ChatFacade) facade).requestInitData(expeditorId);
            if (res != null) {
               buildResponseForInOut(expeditor, expeditorId, expeditorType, getContainerDescription().getInOuts().get("requestInitData"), res);
            }
            return null;
         	}});
   }

   //
   // Constructors 
   //

   /**
    * Constructor
    **/
   public   ChatContainer(String name, String componentDescriptionResource){
      super(name, componentDescriptionResource);
   }


   //
   // Methods 
   //

   /**
    * createFacade()
    * Do NOT invoke super.createFacade()
    **/
   protected  void createFacade(){
      facade = new test.ChatFacade(getIdName());
      initFacadeListeners();
   }

   /**
    * initFacadeListeners()
    **/
   protected  void initFacadeListeners(){
      super.initFacadeListeners();
      ((ChatFacadeInterface) facade).addQueryvoisinsListener(this);
      ((ChatFacadeInterface) facade).addDisconnectListener(this);
      ((ChatFacadeInterface) facade).addInitDataListener(this);
      ((ChatFacadeInterface) facade).addLogListener(this);
      ((ChatFacadeInterface) facade).addQueryListener(this);
      ((ChatFacadeInterface) facade).addQueryAnswerListener(this);
      ((ChatFacadeInterface) facade).addVoisinsListener(this);
      ((ChatFacadeInterface) facade).addExitListener(this);
      ((ChatFacadeInterface) facade).addUndoListener(this);
      ((ChatFacadeInterface) facade).addLogUndoListener(this);
      ((ChatFacadeInterface) facade).addChatListener(this);
      ((ChatFacadeInterface) facade).addConnectToListener(this);
      ((ChatFacadeInterface) facade).addSendListener(this);
   }

   /**
    * QueryvoisinsListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void SendQueryVoisins(QueryvoisinsEvent e){
      send(new MessageImpl("Queryvoisins", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * DisconnectListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void disconnectOut(DisconnectEvent e){
      send(new MessageImpl("disconnect", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * InitDataListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void initData(InitDataEvent e){
      send(new MessageImpl("initData", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * LogListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void log(LogEvent e){
      send(new MessageImpl("log", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * QueryListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void sendQuery(QueryEvent e){
      send(new MessageImpl("query", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * QueryAnswerListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void sendQueryAnswer(QueryAnswerEvent e){
      send(new MessageImpl("queryAnswer", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * VoisinsListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void sendVoisins(VoisinsEvent e){
      send(new MessageImpl("voisins", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * ExitListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void exit(ExitEvent e){
      send(new MessageImpl("exit", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * UndoListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void undo(UndoEvent e){
      send(new MessageImpl("undo", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * LogUndoListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void logUndo(LogUndoEvent e){
      send(new MessageImpl("logUndo", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * ChatListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void output(ChatEvent e){
      send(new MessageImpl("chat", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * ConnectToListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void connectTo(ConnectToEvent e){
      send(new MessageImpl("connectTo", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    * SendListener
    * @throws IllegalStateException to absolutely care in business methods
    **/
   public  void send(SendEvent e){
      send(new MessageImpl("send", e.getAttributes() , null, e.getAdressee()));
   }

   /**
    *  Describe how to serialize this component
    **/
   public  void serialize(){
   }


}
