import axios from 'axios';
import React, { useEffect, useState } from 'react'
import style from './AxiosFetch.module.css'
const AxiosFetch = () => {
    let [state,setState]=useState(null);
    useEffect(()=>{
        try {
            let Axiosf=async()=>{
                let {data}=await axios .get("https://fakestoreapi.com/products");
                console.log(data);
                setState(data);
            }
            Axiosf()
        } catch (error) {
           console.log(error);
        }
    },[])
  return (
    <div>
        {state==null ?"diamond" : state.map((e)=>{
            return <ul key={ e.id}>
                <div>
             <center>   <table border={state}>
                    <tr>
                        
              <th className={style.w}>  <img src={e.image} alt="" /></th>
           <tr> <td className={style.s}><li>{e.title} </li>
           <li>{e.price}</li> 
           <li>{e.title}</li>     
             <li>{e.category}</li>     
            <li>{e.rating.rate}</li>  
           <li> {e.rating.count} </li>       
            </td> </tr>
                </tr>
                </table>
                </center>
                </div>
            </ul>
        })}
    </div>
  )
}

export default AxiosFetch