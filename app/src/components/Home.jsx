import React, { useState } from "react";
import HomeNav from "./HomeNav";
import Categories from "./Categories";
import { Button, Form, FormGroup } from "reactstrap";

function Home() {
    const [restaurants, setRestaurants] = useState([]);

    function selectRestaurant(){
        // //fetch json api
        // fetch("https://infinite-dawn-76227.herokuapp.com/restaurants")
        // .then(res => res.json())
        // .then(data => setRestaurants(data));
        // console.log(restaurants);
    }

    fetch("http://localhost:8080/restaurants")
        .then(res => res.json())
        .then(data => setRestaurants(data)
    );
    console.log(restaurants);
    

    
    

    return (
        <div>
            <HomeNav />
            <Form>
                <div className="homeContainer">
                    <div className="insideContainer">
                        Can't decide where to eat?
                        <FormGroup>
                            <div>I'm feeling for <Categories className="cat" /></div>
                            
                        </FormGroup>
                        <FormGroup>
                            <Button 
                                color="danger" 
                                style={{ fontFamily: "Contrail One" }} 
                                type="submit" 
                                onClick={selectRestaurant}>
                                Let's Eat
                            </Button>
                        </FormGroup>

                    </div>
                </div>
            </Form>

        </div>
    );
}

export default Home;