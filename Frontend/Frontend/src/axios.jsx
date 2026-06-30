import axios from "axios";

const API = axios.create({
  baseURL: "https://e-commerce-website-production-4a12.up.railway.app/api"
});
delete API.defaults.headers.common["Authorization"];
export default API;
