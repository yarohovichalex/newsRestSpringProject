document.addEventListener('DOMContentLoaded', () => createContent(true));

document.getElementById('create-article-form').addEventListener('submit', addArticle);

function addArticle(e) {
    e.preventDefault();
    const title = doc.getElementById('title').value;
    const image = doc.getElementById('image').value;
    const content = doc.getElementById('content').value;
    const data = {
        title,
        image,
        content
    };
    //xhr.open('POST', '', false);
    //xhr.send(data);
    //if (xhr.status !== 200) {
        //console.log('Server error!');
    //} else {
        //let response = xhr.responseText;
        //response = JSON.parse(response);
        data.id = 15;
        addToPage(createArticle(data, true));
    //}
}