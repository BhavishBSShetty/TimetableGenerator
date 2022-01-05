import React, { useState } from "react";
import "./even.css";
import { Link } from "react-router-dom";

function Even() {
  const [fourthinputList, fourthsetInput] = useState([
    {
      subject: "",
      hours: "",
    },
  ]);
  const [sixthinputList, sixthsetInput] = useState([
    {
      subject: "",
      hours: "",
    },
  ]);
  const [eighthinputList, eighthsetInput] = useState([
    {
      subject: "",
      hours: "",
    },
  ]);

  const handleChange = (e, index, option) => {
    const { name, value } = e.target;

    if (option === 0) {
      const list = [...fourthinputList];
      list[index][name] = value;

      fourthsetInput(list);
    } else if (option === 1) {
      const list1 = [...sixthinputList];
      list1[index][name] = value;

      sixthsetInput(list1);
    } else if (option === 2) {
      const list2 = [...eighthinputList];
      list2[index][name] = value;

      eighthsetInput(list2);
    }
  };

  const handleAdd = (option) => {
    if (option === 0) {
      fourthsetInput([
        ...fourthinputList,
        {
          subject: "",
          hours: "",
        },
      ]);
    } else if (option === 1) {
      sixthsetInput([
        ...sixthinputList,
        {
          subject: "",
          hours: "",
        },
      ]);
    } else if (option === 2) {
      eighthsetInput([
        ...eighthinputList,
        {
          subject: "",
          hours: "",
        },
      ]);
    }
  };

  const handleRemove = (index, option) => {
    if (option === 0) {
      const list = [...fourthinputList];
      list.splice(index, 1);
      fourthsetInput(list);
    } else if (option === 1) {
      const list1 = [...sixthinputList];
      list1.splice(index, 1);
      sixthsetInput(list1);
    } else if (option === 2) {
      const list2 = [...eighthinputList];
      list2.splice(index, 1);
      eighthsetInput(list2);
    }
  };

  return (
    <div>
      <div id="bigBox">
        <div id="box"></div>
        <div id="box2"></div>
      </div>

      <div id="bigBox1">
        <div id="box3"></div>
        <div id="box4"></div>
        <div id="box5"></div>
      </div>

      <div id="bigBox2">
        <div id="box6"></div>
        <div id="box7"></div>
      </div>

      <div id="bigBox3">
        <div id="box8"></div>
        <div id="box9"></div>
        <div id="box10"></div>
        <div id="box11"></div>
      </div>
      <div class="bg_circles">
        <div class="circle-1"></div>
        <div class="circle-2"></div>
        <div class="circle-3"></div>
        <div class="circle-4"></div>
      </div>
      <div class="overlay"></div>

      <div class="main">
        <section class="home_section align-item-center active" id="home">
          <div class="container">
            <h1 class="heading">Enter the details</h1>
            <div class=" evenbox">
              <div class="home_text">
                <h2 class="gradient-text">IV semester:&nbsp;&nbsp;</h2>
                <br />
                <h2>
                  Number of sections:&nbsp;&nbsp;
                  <input
                    type="number"
                    name="name"
                    class="login_txt sec_count"
                  />
                </h2>
                <h2 class="subhr">Subjects and number of hours:</h2>
                {fourthinputList.map((items, i) => {
                  return (
                    <div key={i} className="sub_hr">
                      <input
                        type="text"
                        name="subject"
                        placeholder="Subject"
                        id=""
                        class="sub"
                        value={items.subject}
                        onChange={(e) => handleChange(e, i, 0)}
                      />
                      <input
                        type="text"
                        name="hours"
                        placeholder="Total hours"
                        id=""
                        class="hr"
                        value={items.hours}
                        onChange={(e) => handleChange(e, i, 0)}
                      />
                      {fourthinputList.length !== 1 && (
                        <input
                          type="button"
                          name="remove"
                          value="Remove"
                          id=""
                          class=" rmv"
                          onClick={() => handleRemove(i, 0)}
                        />
                      )}
                      <input
                        type="button"
                        name="additm"
                        value="Add"
                        id=""
                        class="additm"
                        onClick={() => handleAdd(0)}
                      />
                    </div>
                  );
                })}

                <br />
              </div>
              <div class="home_text">
                <h2 class="gradient-text">VI semester:&nbsp;&nbsp;</h2>
                <br />
                <h2>
                  Number of sections:&nbsp;&nbsp;
                  <input
                    type="number"
                    name="name"
                    class="login_txt sec_count"
                  />
                </h2>
                <h2 class="subhr">Subjects and number of hours:</h2>
                {sixthinputList.map((items, i) => {
                  return (
                    <div key={i} className="sub_hr">
                      <input
                        type="text"
                        name="subject"
                        placeholder="Subject"
                        id=""
                        class="sub"
                        value={items.subject}
                        onChange={(e) => handleChange(e, i, 1)}
                      />
                      <input
                        type="text"
                        name="hours"
                        placeholder="Total hours"
                        id=""
                        class="hr"
                        value={items.hours}
                        onChange={(e) => handleChange(e, i, 1)}
                      />
                      {sixthinputList.length !== 1 && (
                        <input
                          type="button"
                          name="remove"
                          value="Remove"
                          id=""
                          class="rmv"
                          onClick={() => handleRemove(i, 1)}
                        />
                      )}
                      <input
                        type="button"
                        name="additm"
                        value="Add"
                        id=""
                        class="additm"
                        onClick={() => handleAdd(1)}
                      />
                    </div>
                  );
                })}

                <br />
              </div>
              <div class="home_text">
                <h2 class="gradient-text">VIII semester:</h2>
                <br />
                <h2>
                  Number of sections:&nbsp;&nbsp;
                  <input
                    type="number"
                    name="name"
                    class="login_txt sec_count"
                  />
                </h2>
                <h2 class="subhr">Subjects and number of hours:</h2>
                {eighthinputList.map((items, i) => {
                  return (
                    <div key={i} className="sub_hr">
                      <input
                        type="text"
                        name="subject"
                        placeholder="Subject"
                        id=""
                        class="sub"
                        value={items.subject}
                        onChange={(e) => handleChange(e, i, 2)}
                      />
                      <input
                        type="text"
                        name="hours"
                        placeholder="Total hours"
                        id=""
                        class="hr"
                        value={items.hours}
                        onChange={(e) => handleChange(e, i, 2)}
                      />
                      {eighthinputList.length !== 1 && (
                        <input
                          type="button"
                          name="remove"
                          value="Remove"
                          id=""
                          class="rmv"
                          onClick={() => handleRemove(i, 2)}
                        />
                      )}
                      <input
                        type="button"
                        name="additm"
                        value="Add"
                        id=""
                        class="additm"
                        onClick={() => handleAdd(2)}
                      />
                    </div>
                  );
                })}

                <br />
              </div>
            </div>
            <div className="next">
              <Link to="/section">
                <p class="btn link_item">Next</p>
              </Link>
            </div>
          </div>
        </section>
      </div>
    </div>
  );
}

export default Even;
