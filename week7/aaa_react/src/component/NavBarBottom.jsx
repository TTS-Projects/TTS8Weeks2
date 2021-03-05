
import React, { Component } from 'react';
class NavBarBottom extends Component {


    render() {
        return (
            <div className="BarBottom">
                <h3>Please write me a survey</h3>
                <form method="POST" onSubmit="">
                <label>
                    Name:
                    <input type="text" name="name" />
                </label>
                <input type="submit" value="Submit" />
            
                </form>
            </div>
        )
    }
}

export default NavBarBottom