const ticket = {    
id: 1,  issue: "App crashes on login",    
severity: "high"   };

function createHandler(level) {
    let nextHandler = null;
    return {
        setNext(handler) {
            nextHandler=handler;
            return nextHandler; 
        },
        handle(ticket) {
          if(ticket.severity==level){
            console.log("Ticket is solved by",level)
          } else if(ticket.severity!=level){
                    if (nextHandler){
                        nextHandler.handle(ticket);
                    }else{
                       console.log("Ticket can not be solved  by",level) 
                    }
                }
          }

        }
    }
