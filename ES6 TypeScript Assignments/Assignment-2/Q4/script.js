//Chatting static data
var chatbox1 = new Set();
var chatbox2 = new Set();
chatbox1.add('user1');
chatbox1.add('user2');
chatbox1.add('user3');
chatbox2.add('userA');
chatbox2.add('userB');
chatbox2.add('userC');
//Mapping users to messages
var chatBx1Msg = new Map();
var chatBx2Msg = new Map();
chatBx1Msg.set('user1', new Set(['hi', 'hello', 'ok']));
chatBx1Msg.set('user2', new Set(['hiiii', 'hello ji', 'okay sure']));
chatBx1Msg.set('user3', new Set(['good Morning', 'Goodnight', 'alright!']));
chatBx2Msg.set('userA', new Set(['good Morning', 'Goodnight', 'alright!']));
chatBx2Msg.set('userB', new Set(['hi', 'hello', 'ok']));
chatBx2Msg.set('userC', new Set(['hiiii', 'hello ji', 'okay sure']));
//get list of users
var usersList1 = Array.from(chatbox1);
var usersList2 = Array.from(chatbox2);
console.log("Users list");
console.log(usersList1);
console.log(usersList2);
//get messages from chatroom1
console.log("Messages from chatbox 1:");
var msg1 = chatBx1Msg.entries();
for (var i = 0; i < chatBx1Msg.size; i++) {
    console.log(msg1.next().value);
}
//get messages from chatroom2
console.log("Messages from chatbox 2:");
var msg2 = chatBx2Msg.entries();
for (var i = 0; i < chatBx2Msg.size; i++) {
    console.log(msg2.next().value);
}
