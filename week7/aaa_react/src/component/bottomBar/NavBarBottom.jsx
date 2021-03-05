import React, { Component } from 'react';
import {Link} from 'react-router-dom'

class NavBarBottom extends Component {
        render() {
          const mystyle = {
            color: "white",
            backgroundColor: "DodgerBlue",
            padding: "10px",
            fontFamily: "Arial"
          };
          return (
            <div>
            <br></br>
            <h1 style={mystyle}>Bottom Nav!</h1>
            </div>
          );
        }
}

export default NavBarBottom