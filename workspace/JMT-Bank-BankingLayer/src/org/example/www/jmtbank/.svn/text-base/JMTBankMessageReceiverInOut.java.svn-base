
/**
 * JMTBankMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.jmtbank;

        /**
        *  JMTBankMessageReceiverInOut message receiver
        */

        public class JMTBankMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        JMTBankSkeletonInterface skel = (JMTBankSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("deposit".equals(methodName)){
                
                org.example.www.jmtbank.DepositResponse depositResponse13 = null;
	                        org.example.www.jmtbank.Deposit wrappedParam =
                                                             (org.example.www.jmtbank.Deposit)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.jmtbank.Deposit.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               depositResponse13 =
                                                   
                                                   
                                                         skel.deposit(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), depositResponse13, false, new javax.xml.namespace.QName("http://www.example.org/JMTBank/",
                                                    "deposit"));
                                    } else 

            if("withdraw".equals(methodName)){
                
                org.example.www.jmtbank.WithdrawResponse withdrawResponse15 = null;
	                        org.example.www.jmtbank.Withdraw wrappedParam =
                                                             (org.example.www.jmtbank.Withdraw)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.jmtbank.Withdraw.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               withdrawResponse15 =
                                                   
                                                   
                                                         skel.withdraw(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), withdrawResponse15, false, new javax.xml.namespace.QName("http://www.example.org/JMTBank/",
                                                    "withdraw"));
                                    } else 

            if("authenticateCDClient".equals(methodName)){
                
                org.example.www.jmtbank.AuthenticateCDClientResponse authenticateCDClientResponse17 = null;
	                        org.example.www.jmtbank.AuthenticateCDClient wrappedParam =
                                                             (org.example.www.jmtbank.AuthenticateCDClient)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.jmtbank.AuthenticateCDClient.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               authenticateCDClientResponse17 =
                                                   
                                                   
                                                         skel.authenticateCDClient(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), authenticateCDClientResponse17, false, new javax.xml.namespace.QName("http://www.example.org/JMTBank/",
                                                    "authenticateCDClient"));
                                    } else 

            if("transfer".equals(methodName)){
                
                org.example.www.jmtbank.TransferResponse transferResponse19 = null;
	                        org.example.www.jmtbank.Transfer wrappedParam =
                                                             (org.example.www.jmtbank.Transfer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.jmtbank.Transfer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               transferResponse19 =
                                                   
                                                   
                                                         skel.transfer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), transferResponse19, false, new javax.xml.namespace.QName("http://www.example.org/JMTBank/",
                                                    "transfer"));
                                    } else 

            if("getBalance".equals(methodName)){
                
                org.example.www.jmtbank.GetBalanceResponse getBalanceResponse21 = null;
	                        org.example.www.jmtbank.GetBalance wrappedParam =
                                                             (org.example.www.jmtbank.GetBalance)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.jmtbank.GetBalance.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBalanceResponse21 =
                                                   
                                                   
                                                         skel.getBalance(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBalanceResponse21, false, new javax.xml.namespace.QName("http://www.example.org/JMTBank/",
                                                    "getBalance"));
                                    } else 

            if("authenticateHBClient".equals(methodName)){
                
                org.example.www.jmtbank.AuthenticateHBClientResponse authenticateHBClientResponse23 = null;
	                        org.example.www.jmtbank.AuthenticateHBClient wrappedParam =
                                                             (org.example.www.jmtbank.AuthenticateHBClient)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.jmtbank.AuthenticateHBClient.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               authenticateHBClientResponse23 =
                                                   
                                                   
                                                         skel.authenticateHBClient(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), authenticateHBClientResponse23, false, new javax.xml.namespace.QName("http://www.example.org/JMTBank/",
                                                    "authenticateHBClient"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.Deposit param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.Deposit.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.DepositResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.DepositResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.Withdraw param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.Withdraw.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.WithdrawResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.WithdrawResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.AuthenticateCDClient param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.AuthenticateCDClient.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.AuthenticateCDClientResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.AuthenticateCDClientResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.Transfer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.Transfer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.TransferResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.TransferResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.GetBalance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.GetBalance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.GetBalanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.GetBalanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.AuthenticateHBClient param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.AuthenticateHBClient.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.jmtbank.AuthenticateHBClientResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.jmtbank.AuthenticateHBClientResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.jmtbank.DepositResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.jmtbank.DepositResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.jmtbank.DepositResponse wrapdeposit(){
                                org.example.www.jmtbank.DepositResponse wrappedElement = new org.example.www.jmtbank.DepositResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.jmtbank.WithdrawResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.jmtbank.WithdrawResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.jmtbank.WithdrawResponse wrapwithdraw(){
                                org.example.www.jmtbank.WithdrawResponse wrappedElement = new org.example.www.jmtbank.WithdrawResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.jmtbank.AuthenticateCDClientResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.jmtbank.AuthenticateCDClientResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.jmtbank.AuthenticateCDClientResponse wrapauthenticateCDClient(){
                                org.example.www.jmtbank.AuthenticateCDClientResponse wrappedElement = new org.example.www.jmtbank.AuthenticateCDClientResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.jmtbank.TransferResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.jmtbank.TransferResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.jmtbank.TransferResponse wraptransfer(){
                                org.example.www.jmtbank.TransferResponse wrappedElement = new org.example.www.jmtbank.TransferResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.jmtbank.GetBalanceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.jmtbank.GetBalanceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.jmtbank.GetBalanceResponse wrapgetBalance(){
                                org.example.www.jmtbank.GetBalanceResponse wrappedElement = new org.example.www.jmtbank.GetBalanceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.jmtbank.AuthenticateHBClientResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.jmtbank.AuthenticateHBClientResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.jmtbank.AuthenticateHBClientResponse wrapauthenticateHBClient(){
                                org.example.www.jmtbank.AuthenticateHBClientResponse wrappedElement = new org.example.www.jmtbank.AuthenticateHBClientResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.jmtbank.Deposit.class.equals(type)){
                
                           return org.example.www.jmtbank.Deposit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.DepositResponse.class.equals(type)){
                
                           return org.example.www.jmtbank.DepositResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.Withdraw.class.equals(type)){
                
                           return org.example.www.jmtbank.Withdraw.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.WithdrawResponse.class.equals(type)){
                
                           return org.example.www.jmtbank.WithdrawResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.AuthenticateCDClient.class.equals(type)){
                
                           return org.example.www.jmtbank.AuthenticateCDClient.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.AuthenticateCDClientResponse.class.equals(type)){
                
                           return org.example.www.jmtbank.AuthenticateCDClientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.Transfer.class.equals(type)){
                
                           return org.example.www.jmtbank.Transfer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.TransferResponse.class.equals(type)){
                
                           return org.example.www.jmtbank.TransferResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.GetBalance.class.equals(type)){
                
                           return org.example.www.jmtbank.GetBalance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.GetBalanceResponse.class.equals(type)){
                
                           return org.example.www.jmtbank.GetBalanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.AuthenticateHBClient.class.equals(type)){
                
                           return org.example.www.jmtbank.AuthenticateHBClient.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.jmtbank.AuthenticateHBClientResponse.class.equals(type)){
                
                           return org.example.www.jmtbank.AuthenticateHBClientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    