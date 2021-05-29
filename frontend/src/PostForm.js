import React, { Component } from 'react'
import axios from 'axios'

class PostForm extends Component {

    constructor(props) {
        super(props);

        this.state = {
            productKey: ''
        }
    }
    
    changeHandler = (e) => {
        this.setState({[e.target.name]: e.target.value});
    }

    submitHandler = (e) => {
        e.preventDefault();
        console.log(this.state);
        axios.post("", this.state)
        .then(response => {
            console.log(response)
        })
        .catch(error => {
            console.log(error)
        })
    }
    
    render() {
        const {productKey} = this.state;
        return (
            <form onSubmit={this.submitHandler}> 
                <label className="App-form-label">Enter Product Keyword(s): </label>
                <input className="App-form-input" type="text" name="productKey" value={productKey} onChange={this.changeHandler}></input>
                <button className="App-form-submit-btn" type="submit">Submit</button>
            </form>
        )
    }
}

export default PostForm;