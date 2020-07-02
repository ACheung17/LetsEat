import React, { useState } from "react";
import { Dropdown, DropdownToggle, DropdownMenu, DropdownItem } from "reactstrap";

function Categories() {
    const [dropdownOpen, setDropdownOpen] = useState(false);
    const [dropdownValue, setDropdownValue] = useState("Anything");

    const toggle = () => setDropdownOpen(prevState => !prevState);

    function changeValue(event) {    
        setDropdownValue(event.target.textContent);
    }
    
    return (
        <Dropdown isOpen={dropdownOpen} toggle={toggle} size="sm">
        <DropdownToggle caret color="light">{dropdownValue}</DropdownToggle>
        <DropdownMenu>
            <DropdownItem onClick={changeValue}>Anything</DropdownItem>
            <DropdownItem divider />
            <DropdownItem onClick={changeValue}>Chinese</DropdownItem>
            <DropdownItem onClick={changeValue}>Fast Food</DropdownItem>
            <DropdownItem onClick={changeValue}>Italian</DropdownItem>
            <DropdownItem onClick={changeValue}>Japenses</DropdownItem>
            <DropdownItem onClick={changeValue}>Korean</DropdownItem>
            <DropdownItem onClick={changeValue}>Taiwanese</DropdownItem>
        </DropdownMenu>
        </Dropdown>
    );
}

export default Categories;