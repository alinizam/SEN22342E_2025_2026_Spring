function createPerson(type){
    if (type=="Email")
        return {  message: "I a a email",  
                type: type,  
                sendMessage: function() {   
                                    return 'My name is '+this.message; 
                }
        }
    if (type=="Email")
        return {  message: "I a  email",  
                type: type,  
                sendMessage: function() {   
                                    return 'My name is '+this.message; 
                }
        }    
}