
import React, { Component }  from 'react';
import welcome from '../../images/welcome.jpeg';
class NavBar extends Component {


    render() {
        return (
            <div className="top">
                <h1>Nav Bar</h1>
                <img src={welcome} alt="welcome screen"/>
                <br></br>
            </div>
        )
    }
}

export default NavBar