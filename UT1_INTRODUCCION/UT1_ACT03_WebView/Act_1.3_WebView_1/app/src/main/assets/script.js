function addTask(){
    const taskInput = document.getElementByld("taskinput");
    const taskText = taskInput.value.trim();
    if (taskText === "") {
        alert("Por favor, escribe una tarea.");
    }
    return;
    }

    const li = document.createElement("li");
    li.textContent = taskText;
    li.addEventListener("click", function(){
        li.classList.toggle("completed");
    };

    const deleteBtn = document.createElement("button");
    deleteBtn.textContent="X";
    deleteBtn.style.marginLeft="10px";
    deleteBtn.style.background="red";
    deleteBtn.style.color = "white";
    deleteBtn.style.border = "none";
    deleteBtn.style.cursor = "pointer";

    deleteBtn.onclick = function(){
        li.remove();
    };

    li.appendChild(deleteBtn);
    document.getElementByld("taskList").appendChild(u);
    taskInput.value="":
}