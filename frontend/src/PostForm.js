import React, { Component } from 'react'

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
    }
    
    render() {
        const {productKey} = this.state;
        return (
            <form onSubmit={this.submitHandler}> 
                <label>Inside Postform label</label>
                <input type="text" name="productKey" value={productKey} onChange={this.changeHandler}></input>
                <button type="submit">Submit</button>
            </form>
        )
    }
}

export default PostForm;