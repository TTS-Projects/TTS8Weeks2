import React, { Component } from 'react';
import ListCoursesComponent from './ListCoursesComponent';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import CourseComponent from './CourseComponent';
import Survey from './Survey';
import Home from './Home'

class InstructorApp extends Component {
    render() {
        return (
            <Router>
                <>
                    <h1>Instructor Application</h1>
                    <Switch>
                        <Route path="/" exact component={Home} />
                        <Route path="/co" exact component={ListCoursesComponent} />
                        {/*
                        <Route path="/" exact component={NavBarBottom} />
                        <Route path="/" exact component={NavBar} /> 
                        */}
                        <Route path="/courses" exact component={ListCoursesComponent} />
                        <Route path="/courses/:id" component={CourseComponent} />
                        <Route path="/survey"  component={Survey} />
                    </Switch>
                </>
            </Router>
        )
    }
}

export default InstructorApp