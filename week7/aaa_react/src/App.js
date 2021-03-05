import React, { Component } from 'react';
import './App.css';
import InstructorApp from './component/InstructorApp';
import NavBar from './component/NavBar';
import NavBarBottom from './component/NavBarBottom';


class App extends Component {
  render() {
    return (
      <div className="container">
        <NavBar />
        <InstructorApp />
        <NavBarBottom />
      </div>
    );
  }
}

export default App;
