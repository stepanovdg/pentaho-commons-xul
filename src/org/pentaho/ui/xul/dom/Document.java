/**
 * 
 */
package org.pentaho.ui.xul.dom;

import org.pentaho.ui.xul.XulComponent;
import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.XulException;


/**
 * @author NBaker
 *
 */
public interface Document extends Element{
  public XulComponent getRootElement();
  public XulComponent createElement(String elementName) throws XulException;
  public void setXulDomContainer(XulDomContainer container);
  
}