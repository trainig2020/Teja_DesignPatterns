package com;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "teja");
		User user2 = new UserImpl(mediator, "pooja");
		User user3 = new UserImpl(mediator, "vish");
		User user4 = new UserImpl(mediator, "ram");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
		
	}

}
