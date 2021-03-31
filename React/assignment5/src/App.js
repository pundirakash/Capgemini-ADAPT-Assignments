import React,{Component} from 'react'
import './components/styles/App.css';
import Clock from './components/Clock';
import Header from './components/Header'

class App extends Component {

  constructor() {
      super();

      this.state = {
          title: 'React Clock'
      };
  }

  render() {
      return (
          <div>
              <Header title={this.state.title} />
              <Clock />
          </div>
      );
  }
}
export default App;
