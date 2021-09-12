import React, {useContext, useEffect, useState} from 'react';
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';

//IMP : 1 -> props => property passed to the component
const ModalDemo = (props) => {

    const { buttonLabel = 'Click', className, dialogViewCount, setDialogViewCount } = props; //default value -> click
    // const context = useContext(CartContext)

    //const [modal, setModal] = useState(false);
    /*let modal = false
    const setModal = (m) => { //setter ( getter /setter?)
        modal = m
    }*/
    const [modal, setModal] = useState(false) //hook, javascript getter /setter
    const students = [
        {id: 1, name: 'Erin', color: 'red'},
        {id: 2, name: 'Sam', color: 'green'},
        {id: 3, name: 'Suman', color: 'blue'}
    ]

    //IMP: function call / value update
    // const toggle = () => setModal(!modal);

    const toggle = () => {
        setModal(!modal) //!false => true
    }

    const open = () => {
        toggle()
        setDialogViewCount(dialogViewCount + 1)
    }

    const apply = () => {
        //Do something
        //Save data to database
        //API Cal...
        toggle()
    }

    useEffect(() => {
        console.warn(1, 'Model value is changed....', modal)
    }, [modal]);

    //renderer
    return (<>
        <div>

            <Button color="danger" onClick={open}>{buttonLabel}</Button>
            {/* one way <Button color="danger" onClick={toggle}>{buttonLabel == undefined ? 'Click' : buttonLabel}</Button> */}
            <Modal isOpen={modal} toggle={toggle} className={className}>
                <ModalHeader toggle={toggle}>Bootcamp Eran, Suman, Sam</ModalHeader>
                <ModalBody>
                    <b>BootCamp Australia, 2021 in covid time. </b>
                    <strong> Total Model Open Count: {dialogViewCount}</strong>
                    {students.map(stud => <h5 key={stud.id} style={{color: stud.color}}>{stud.name}</h5>)}
                </ModalBody>
                <ModalFooter>
                    <Button color="primary" onClick={apply}>Do Something</Button>{' '}
                    <Button color="secondary" onClick={toggle}>Cancel</Button>
                </ModalFooter>
            </Modal>


        </div>
        </>
    );
}

export default ModalDemo;