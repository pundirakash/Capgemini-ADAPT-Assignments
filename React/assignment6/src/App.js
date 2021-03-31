import './App.css';
import {BrowserRouter as Router, Link , Route, NavLink} from 'react-router-dom'
import React,{Component} from 'react'
const Projects=()=>{ return (<div><h1>You choose <button >Projects</button></h1> </div>)}
const Services=()=>{ return (<div><h1>You choose  <button >Services</button></h1></div>)}
const Contact=()=>{ return (<div><h1>You choose <button >Contact</button></h1> </div>)}
class App extends Component{
  
render() {
  return (
    <Router>
    <div className="App">
    <ul>
       <li>
         <NavLink to="/" exact activeStyle={{color:'blue'}}><a>Home</a></NavLink>
       </li>
       <li>
         <NavLink to="/projects" activeStyle={{color:'blue'}}><a>Projects</a></NavLink>
       </li>
       <li>
         <NavLink to="/services" activeStyle={{color:'blue'}}><a>Services</a></NavLink>
       </li>
       <li>
         <NavLink to="/contact" activeStyle={{color:'blue'}}><a>Contact</a></NavLink>
       </li>
     </ul>
     <Route path="/" exact render={()=>{return(<h1>You Choose <button>Home</button></h1>)}}/>
     <Route path="/projects" exact  component={Projects}/>
     <Route path="/services" exact  component={Services}/>
     <Route path="/contact" exact  component={Contact}/>
    </div>
    </Router>
  );
}
}
export default App;
