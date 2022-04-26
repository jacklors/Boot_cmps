import React, {useState, useEffect} from 'react'
import '../Ifoodcounter/Ifoodcounter.css'



export default function Ifoodcounter() {

    const [value, setValue] = useState(1);
    const [buttonStyle, setButtonStyle] = useState("counter-button-minus-active");


    useEffect(() => {
        console.log(`o estilo do botao atula é: ${buttonStyle}`)
    },[buttonStyle])

    function down() {

        if (value <= 1) {
            setButtonStyle("counter-button-plus-desactive")
        }
        if (value > 0) {
            setValue(value - 1)
        }

    }

    function up() {
        setValue(value + 1)
        setButtonStyle("counter-button-plus-active")
    }

    return (
        <div className="countex-wrapper">I

            <button
                className={buttonStyle}
                onClick={down}>-</button>
            <p>{value}</p>
            <button
                className="counter-button-plus-active"
                onClick={up}>+</button>
        </div>
    )
}
