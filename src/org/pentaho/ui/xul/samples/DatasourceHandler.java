/**
 * 
 */
package org.pentaho.ui.xul.samples;

import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.components.XulListitem;
import org.pentaho.ui.xul.components.XulTextbox;
import org.pentaho.ui.xul.containers.XulGroupbox;
import org.pentaho.ui.xul.containers.XulListbox;
import org.pentaho.ui.xul.impl.XulEventHandler;

/**
 * @author OEM
 *
 */
public class DatasourceHandler extends XulEventHandler{
 
  XulTextbox connectionTextbox;
  XulListbox connectionType;
  XulTextbox hostName;
  XulTextbox databaseName;
  XulTextbox portNumber;
  XulTextbox username;
  XulTextbox password;
  
  
  public void onLoad(){
    connectionTextbox = (XulTextbox) document.getElementById("connection-name-text");
    connectionType = (XulListbox) document.getElementById("connection-type-list");
    hostName = (XulTextbox) document.getElementById("server-host-name-text");
    databaseName = (XulTextbox) document.getElementById("database-name-text");
    portNumber = (XulTextbox) document.getElementById("port-number-text");
    username = (XulTextbox) document.getElementById("username-text");
    password = (XulTextbox) document.getElementById("password-text");
    
    System.out.println("In init()");
  }
  
  
  public void changeConnectionType(){
    XulListitem selectedItem = (XulListitem) connectionType.getSelectedItem();
    String selectedValue = selectedItem.getLabel();
    
    if(selectedValue.equals("Oracle")){
        try{
          XulDomContainer container = this.xulDomContainer.loadFragment("org/pentaho/ui/xul/samples/datasource_oracle.xul");
          XulGroupbox newBox = (XulGroupbox) container.getDocumentRoot().getRootElement();
          XulGroupbox oldBox = (XulGroupbox) document.getElementById("database-options-box");
          
          document.getElementById("button-box").replaceChild(oldBox, newBox);
          
          
        } catch(Exception e){
          System.out.println("XulException loading fragment: "+e.getMessage());
          e.printStackTrace(System.out);
        }
    }
    
//    hostName.setValue( String.format("%s host name", selectedValue) );
//    databaseName.setValue( String.format("%s database name", selectedValue) );
//    portNumber.setValue( String.format("%s port number", selectedValue) );
//    username.setValue( String.format("%s username", selectedValue) );
//    password.setValue( String.format("%s password", selectedValue) );
//    
  }


  @Override
  public Object getData() {
    return null;
  }


  @Override
  public void setData(Object data) {
    
  }
 
  
  
}
