import React from 'react';
import { Nav, Navbar, NavLink, NavbarBrand } from 'reactstrap';

function HomeNav() {
    return (
        <div>
        <Navbar style={{backgroundColor: "#ff6961"}}>
            <NavbarBrand href="/">LET'S EAT</NavbarBrand>
            <Nav className="ml-auto" navbar >
                <NavLink href="">Restaurants</NavLink>
            </Nav>
        </Navbar>
        </div>
    );
}

export default HomeNav;
