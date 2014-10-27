package org.devdom.influencer.bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.devdom.influencer.model.dao.GraphDao;
import org.devdom.influencer.model.dto.GraphCommentsStat;
import org.devdom.influencer.model.dto.GraphPostsStat;
 
/**
 *
 * @author Carlos Vasquez Polanco
 */
@ManagedBean
@RequestScoped
public class GraphController  implements Serializable{
    
    private final GraphDao dao = new GraphDao();
    
    /**
     * Obtener valores para formar el gráfico de la cantidad de publicaciones por meses
     * @return 
     */
    public List<GraphPostsStat> getPostsStats(){
        return dao.findPostsStats();
    }

    /**
     * Obtener valores para formar el gráfico de la cantidad de comentarios por meses
     * @return 
     */
    public List<GraphCommentsStat> getCommentsStats(){
        return dao.findCommentsStats();
    }
    
    /**
     * Codigo del que no estoy orgulloso, pero fue la forma más óptima posible de renderizar la  gráfica de comentarios
     * 
     * @return 
     */
    public String getCommentsGraphV2(){
        String html =   "<script type=\"text/javascript\">" +
                        "   AmCharts.makeChart(\"chartComments\"," +
                        "   {" +
                        "       \"type\": \"serial\"," +
                        "       \"pathToImages\": \"http://cdn.amcharts.com/lib/3/images/\"," +
                        "       \"categoryField\": \"category\"," +
                        "       \"sequencedAnimation\": false,"+
                        "       \"backgroundAlpha\": 1," +
                        "       \"backgroundColor\": \"#323943\"," +
                        "       \"borderAlpha\": 1," +
                        "       \"borderColor\": \"#858592\"," +
                        "       \"color\": \"#858592\"," +
                        "       \"fontFamily\": \"Consolas\"," +
                        "       \"categoryAxis\": {" +
                        "          \"gridPosition\": \"start\"," +
                        "          \"axisAlpha\": 0.7," +
                        "          \"axisColor\": \"#AAB3B3\"," +
                        "          \"fillAlpha\": 0.13," +
                        "          \"fillColor\": \"#858592\"," +
                        "          \"gridAlpha\": 0.14," +
                        "          \"gridColor\": \"#AAB3B3\"," +
                        "          \"minorGridAlpha\": 0.71," +
                        "          \"titleColor\": \"#AAB3B3\"" +
                        "       }," +
                        "       \"trendLines\": []," +
                        "       \"graphs\": [" +
                        "       {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"201514949865358\"," +
                        "\"title\": \"Developers Dominicanos\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-201514949865358\"" +
                        "      }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"161328360736390\"," +
                        "\"title\": \"Hackers and Founders - Santo Domingo\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-161328360736390\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"137759453068575\"," +
                        "\"title\": \"Python Dominicana\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-137759453068575\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"264382946926439\"," +
                        "\"title\": \"#VivaPHP\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-264382946926439\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"132533423551389\"," +
                        "\"title\": \"developers X\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-132533423551389\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"358999187465748\"," +
                        "\"title\": \"CodigoLibre_Developers\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-358999187465748\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"179210165492903\"," +
                        "\"title\": \"Caribbean SQL\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-179210165492903\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"150647751783730\"," +
                        "\"title\": \"Javascript Dominicana\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-150647751783730\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"455974804478621\"," +
                        "\"title\": \"Mobile Developer Group\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-455974804478621\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"220361121324698\"," +
                        "\"title\": \"DevelopersRD\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-220361121324698\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"634620033215438\"," +
                        "\"title\": \"C#.do\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-634620033215438\"" +
                        "                            }," +
                        "                            {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "\"id\": \"179901595397349\"," +
                        "\"title\": \"CDDV - Comunidad Dominicana de Desarrolladores de Videojuegos\"," +
                        "\"type\": \"smoothedLine\"," +
                        "\"valueField\": \"column-179901595397349\"" +
                        "                            }" +
                        "                    ]," +
                        "                    \"guides\": []," +
                        "                    \"valueAxes\": [" +
                        "                            {" +
                        "    \"id\": \"ValueAxis-1\"," +
                        "    \"axisColor\": \"#858592\","+
                        "    \"color\": \"#858592\","+
                        "    \"gridAlpha\": 0.33,"+
                        "    \"gridColor\": \"#858592\","+
                        "    \"titleColor\": \"#858592\","+
                        "    \"title\": \"Comentarios\"" +
                        "                            }" +
                        "                    ]," +
                        "                    \"allLabels\": []," +
                        "    \"balloon\": {" +
                        "       \"borderColor\": \"#858592\"," +
                        "	\"color\": \"#858592\"," +
                        "	\"cornerRadius\": 4" +
                        "    }," +
                        "       \"legend\": {" +
                        "       \"color\": \"#858592\"," +
                        "       \"useGraphSettings\": true" +
                        "    }," +
                        "    \"titles\": [" +
                        "    {" +
                        "       \"bold\": true," +
                        "       \"color\": \"#858592\"," +
                        "       \"id\": \"Title-1\"," +
                        "       \"size\": 15," +
                        "       \"text\": \"Gráfica de actividad mes por mes de los comentarios creados en los distintos grupos de desarrollo\"" +
                        "    }" +
                        "    ]," +
                        "    \"dataProvider\": [";

            String monthNameTemp = "";
            int counter = 0;
            for(GraphCommentsStat graph : getCommentsStats()){
                if(!monthNameTemp.equals(graph.getMonths())){
                    if(counter==0)
                        html +="{";
                    else{
                        html +="},{";
                    }
                }

                html += "'category': '"+graph.getMonths()+" "+ graph.getYears()+"',";
                html += "'"+graph.getGroupColumnId()+"': "+graph.getAmount()+", ";
                monthNameTemp = graph.getMonths();
                counter++;
            }
            html += "}";

            html += "            ]" +
                    "        }" +
                    "   );" +
                    "</script>";
        return html;
    }

    /**
     * Codigo del que no estoy orgulloso, pero fue la forma más óptima posible de renderizar la  gráfica de comentarios
     * 
     * @return 
     */
    public String getCommentsGraph(){
        String html = "<script type=\"text/javascript\">\n" +
"                                    AmCharts.makeChart(\"chartComments\",\n" +
"                                            {\n" +
"                                                    \"type\": \"serial\",\n" +
"                                                    \"pathToImages\": \"http://cdn.amcharts.com/lib/3/images/\",\n" +
"                                                    \"categoryField\": \"category\",\n" +
"                                                     \"sequencedAnimation\": false,\n"+
"                                                    \"categoryAxis\": {\n" +
"                                                            \"gridPosition\": \"start\"\n" +
"                                                    },\n" +
"                                                    \"trendLines\": [],\n" +
"                                                    \"graphs\": [\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"201514949865358\",\n" +
"                                                                \"title\": \"Developers Dominicanos\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-201514949865358\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"161328360736390\",\n" +
"                                                                \"title\": \"Hackers and Founders - Santo Domingo\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-161328360736390\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"137759453068575\",\n" +
"                                                                \"title\": \"Python Dominicana\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-137759453068575\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"264382946926439\",\n" +
"                                                                \"title\": \"#VivaPHP\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-264382946926439\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"132533423551389\",\n" +
"                                                                \"title\": \"developers X\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-132533423551389\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"358999187465748\",\n" +
"                                                                \"title\": \"CodigoLibre_Developers\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-358999187465748\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"179210165492903\",\n" +
"                                                                \"title\": \"Caribbean SQL\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-179210165492903\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"150647751783730\",\n" +
"                                                                \"title\": \"Javascript Dominicana\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-150647751783730\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"455974804478621\",\n" +
"                                                                \"title\": \"Mobile Developer Group\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-455974804478621\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"220361121324698\",\n" +
"                                                                \"title\": \"DevelopersRD\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-220361121324698\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"634620033215438\",\n" +
"                                                                \"title\": \"C#.do\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-634620033215438\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] comentarios en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"179901595397349\",\n" +
"                                                                \"title\": \"CDDV - Comunidad Dominicana de Desarrolladores de Videojuegos\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-179901595397349\"\n" +
"                                                            }\n" +
"                                                    ],\n" +
"                                                    \"guides\": [],\n" +
"                                                    \"valueAxes\": [\n" +
"                                                            {\n" +
"                                                                    \"id\": \"ValueAxis-1\",\n" +
"                                                                    \"title\": \"Comentarios\"\n" +
"                                                            }\n" +
"                                                    ],\n" +
"                                                    \"allLabels\": [],\n" +
"                                                    \"balloon\": {},\n" +
"                                                    \"legend\": {\n" +
"                                                            \"useGraphSettings\": true\n" +
"                                                    },\n" +
"                                                    \"titles\": [\n" +
"                                                            {\n" +
"                                                                    \"id\": \"Title-1\",\n" +
"                                                                    \"size\": 15,\n" +
"                                                                    \"text\": \"Gráfica de actividad mes por mes de los comentarios creados en los distintos grupos de desarrollo\"\n" +
"                                                            }\n" +
"                                                    ],\n" +
"                                                    \"dataProvider\": [\n";

            String monthNameTemp = "";
            int counter = 0;
            for(GraphCommentsStat graph : getCommentsStats()){
                if(!monthNameTemp.equals(graph.getMonths())){
                    if(counter==0)
                        html +="{";
                    else{
                        html +="},{";
                    }
                }

                html += "'category': '"+graph.getMonths()+" "+ graph.getYears()+"',\n";
                html += "'"+graph.getGroupColumnId()+"': "+graph.getAmount()+", \n";
                monthNameTemp = graph.getMonths();
                counter++;
            }
            html += "}";

            html += "            ]\n" +
                    "        }\n" +
                    "   );\n" +
                    "</script>";
        return html;
    }
    
    /**
     * Codigo del que no estoy orgulloso, pero fue la forma más óptima posible de renderizar la  gráfica de comentarios
     * 
     * @return 
     */
    public String getPostsGraphV2(){

        String html =   "<script type=\"text/javascript\">" +
                        " AmCharts.makeChart(\"chartPosts\"," +
                        "   {" +
                        "       \"type\": \"serial\"," +
                        "       \"pathToImages\": \"http://cdn.amcharts.com/lib/3/images/\"," +
                        "       \"categoryField\": \"category\"," +
                        "       \"backgroundAlpha\": 1," +
                        "       \"backgroundColor\": \"#323943\"," +
                        "       \"borderAlpha\": 1," +
                        "       \"borderColor\": \"#858592\"," +
                        "       \"color\": \"#858592\"," +
                        "       \"fontFamily\": \"Consolas\"," +
                        "       \"sequencedAnimation\": false,"+
                        "       \"categoryAxis\": {" +
                        "           \"gridPosition\": \"start\"," +
                        "           \"axisAlpha\": 0.7," +
                        "           \"axisColor\": \"#AAB3B3\"," +
                        "           \"fillAlpha\": 0.13," +
                        "           \"fillColor\": \"#858592\"," +
                        "           \"gridAlpha\": 0.14," +
                        "           \"gridColor\": \"#AAB3B3\"," +
                        "           \"minorGridAlpha\": 0.71," +
                        "           \"titleColor\": \"#AAB3B3\"" +
                        "       }," +
                        "       \"trendLines\": []," +
                        "       \"graphs\": [" +
                        "       {" +
                        "           \"balloonColor\": \"#9D907B\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9D907B\"," +
                        "           \"bulletColor\": \"#9D907B\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9D907B\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9D907B\"," +
                        "           \"lineColor\": \"#9D907B\"," +
                        "           \"id\": \"201514949865358\"," +
                        "           \"title\": \"Developers Dominicanos\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-201514949865358\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#A48784\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#A48784\"," +
                        "           \"bulletColor\": \"#A48784\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#A48784\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#A48784\"," +
                        "           \"lineColor\": \"#A48784\"," +
                        "           \"id\": \"161328360736390\"," +
                        "           \"title\": \"Hackers and Founders - Santo Domingo\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-161328360736390\"" +
                        "        }," +
                        "        {" +
                        "           \"balloonColor\": \"#605D7E\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#605D7E\"," +
                        "           \"bulletColor\": \"#605D7E\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#605D7E\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#605D7E\"," +
                        "           \"lineColor\": \"#605D7E\"," +
                        "           \"id\": \"137759453068575\"," +
                        "           \"title\": \"Python Dominicana\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-137759453068575\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#7E605D\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#7E605D\"," +
                        "           \"bulletColor\": \"#7E605D\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#7E605D\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#7E605D\"," +
                        "           \"lineColor\": \"#7E605D\"," +
                        "           \"id\": \"264382946926439\"," +
                        "           \"title\": \"#VivaPHP\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-264382946926439\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#DACDD8\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#DACDD8\"," +
                        "           \"bulletColor\": \"#DACDD8\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#DACDD8\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#DACDD8\"," +
                        "           \"lineColor\": \"#DACDD8\"," +
                        "           \"id\": \"132533423551389\"," +
                        "           \"title\": \"developers X\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-132533423551389\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#715D7E\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#715D7E\"," +
                        "           \"bulletColor\": \"#715D7E\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#715D7E\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#715D7E\"," +
                        "           \"lineColor\": \"#715D7E\"," +
                        "           \"id\": \"358999187465748\"," +
                        "           \"title\": \"CodigoLibre_Developers\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-358999187465748\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#5D7E60\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#5D7E60\"," +
                        "           \"bulletColor\": \"#5D7E60\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#5D7E60\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#5D7E60\"," +
                        "           \"lineColor\": \"#5D7E60\"," +
                        "           \"id\": \"179210165492903\"," +
                        "           \"title\": \"Caribbean SQL\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-179210165492903\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#5D7B7E\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#5D7B7E\"," +
                        "           \"bulletColor\": \"#5D7B7E\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#5D7B7E\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#5D7B7E\"," +
                        "           \"lineColor\": \"#5D7B7E\"," +
                        "           \"id\": \"150647751783730\"," +
                        "           \"title\": \"Javascript Dominicana\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-150647751783730\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#7B7E5D\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#7B7E5D\"," +
                        "           \"bulletColor\": \"#7B7E5D\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#7B7E5D\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#7B7E5D\"," +
                        "           \"lineColor\": \"#7B7E5D\"," +
                        "           \"id\": \"455974804478621\"," +
                        "           \"title\": \"Mobile Developer Group\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-455974804478621\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#D1DACD\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#D1DACD\"," +
                        "           \"bulletColor\": \"#D1DACD\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#D1DACD\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#D1DACD\"," +
                        "           \"lineColor\": \"#D1DACD\"," +
                        "           \"id\": \"220361121324698\"," +
                        "           \"title\": \"DevelopersRD\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-220361121324698\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#7E5D6A\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#7E5D6A\"," +
                        "           \"bulletColor\": \"#7E5D6A\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#7E5D6A\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#7E5D6A\"," +
                        "           \"lineColor\": \"#7E5D6A\"," +
                        "           \"id\": \"634620033215438\"," +
                        "           \"title\": \"C#.do\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-634620033215438\"" +
                        "       }," +
                        "       {" +
                        "           \"balloonColor\": \"#9EA8B7\"," +
                        "           \"balloonText\": \"[[value]] post en [[category]] por [[title]]\"," +
                        "           \"bulletBorderAlpha\": 0.18," +
                        "           \"bulletBorderColor\": \"#9EA8B7\"," +
                        "           \"bulletColor\": \"#9EA8B7\"," +
                        "           \"cursorBulletAlpha\": 0.18," +
                        "           \"bullet\": \"round\"," +
                        "           \"fillColors\": \"#9EA8B7\"," +
                        "           \"columnWidth\": 0.15," +
                        "           \"legendAlpha\": 0," +
                        "           \"legendColor\": \"#9EA8B7\"," +
                        "           \"lineColor\": \"#9EA8B7\"," +
                        "           \"id\": \"179901595397349\"," +
                        "           \"title\": \"CDDV - Comunidad Dominicana de Desarrolladores de Videojuegos\"," +
                        "           \"type\": \"smoothedLine\"," +
                        "           \"valueField\": \"column-179901595397349\"" +
                        "       }" +
                        "    ]," +
                        "    \"guides\": []," +
                        "    \"valueAxes\": [" +
                        "       {" +
                        "           \"id\": \"ValueAxis-1\"," +
                        "           \"axisColor\": \"#858592\","+
                        "           \"color\": \"#858592\","+
                        "           \"gridAlpha\": 0.33,"+
                        "           \"gridColor\": \"#858592\","+
                        "           \"titleColor\": \"#858592\","+
                        "           \"title\": \"Publicaciones\"" +
                        "       }" +
                        "    ]," +
                        "    \"allLabels\": []," +
                        "    \"balloon\": {" +
                        "       \"borderColor\": \"#858592\"," +
                        "	\"color\": \"#858592\"," +
                        "	\"cornerRadius\": 4" +
                        "    }," +
                        "    \"legend\": {" +
                        "       \"color\": \"#858592\"," +
                        "       \"useGraphSettings\": true" +
                        "    }," +
                        "       \"titles\": [" +
                        "       {" +
                        "           \"bold\": true," +
                        "           \"color\": \"#858592\"," +
                        "           \"id\": \"Title-1\"," +
                        "           \"size\": 15," +
                        "           \"text\": \"Gráfica de actividad mes por mes de las publicaciones creadas en los distintos grupos de desarrollo\"" +
                        "       }" +
                        "     ]," +
                        "   \"dataProvider\": [";
            
            String monthNameTemp = "";
            int counter = 0;
            for(GraphPostsStat graph : getPostsStats()){
                if(!monthNameTemp.equals(graph.getMonths())){
                    if(counter==0)
                        html +="{";
                    else{
                        html +="},{";
                    }
                }

                html += "'category': '"+graph.getMonths()+" "+ graph.getYears()+"',\n";
                html += "'"+graph.getGroupColumnId()+"': "+graph.getAmount()+", \n";
                monthNameTemp = graph.getMonths();
                counter++;
            }
            html += "}";

            html += "            ]\n" +
                    "        }\n" +
                    "   );" +
                    "</script>";
        return html;
    }
    
    /**
     * Codigo del que no estoy orgulloso, pero fue la forma más óptima posible de renderizar la  gráfica de comentarios
     * 
     * @return 
     */
    public String getPostsGraph(){

        String html = "<script type=\"text/javascript\">\n" +
"                                    AmCharts.makeChart(\"chartPosts\",\n" +
"                                            {\n" +
"                                                    \"type\": \"serial\",\n" +
"                                                    \"pathToImages\": \"http://cdn.amcharts.com/lib/3/images/\",\n" +
"                                                    \"categoryField\": \"category\",\n" +
"                                                     \"sequencedAnimation\": false,\n"+
"                                                    \"categoryAxis\": {\n" +
"                                                            \"gridPosition\": \"start\"\n" +
"                                                    },\n" +
"                                                    \"trendLines\": [],\n" +
"                                                    \"graphs\": [\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"201514949865358\",\n" +
"                                                                \"title\": \"Developers Dominicanos\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-201514949865358\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"161328360736390\",\n" +
"                                                                \"title\": \"Hackers and Founders - Santo Domingo\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-161328360736390\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"137759453068575\",\n" +
"                                                                \"title\": \"Python Dominicana\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-137759453068575\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"264382946926439\",\n" +
"                                                                \"title\": \"#VivaPHP\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-264382946926439\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"132533423551389\",\n" +
"                                                                \"title\": \"developers X\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-132533423551389\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"358999187465748\",\n" +
"                                                                \"title\": \"CodigoLibre_Developers\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-358999187465748\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"179210165492903\",\n" +
"                                                                \"title\": \"Caribbean SQL\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-179210165492903\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"150647751783730\",\n" +
"                                                                \"title\": \"Javascript Dominicana\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-150647751783730\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"455974804478621\",\n" +
"                                                                \"title\": \"Mobile Developer Group\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-455974804478621\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"220361121324698\",\n" +
"                                                                \"title\": \"DevelopersRD\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-220361121324698\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"634620033215438\",\n" +
"                                                                \"title\": \"C#.do\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-634620033215438\"\n" +
"                                                            },\n" +
"                                                            {\n" +
"                                                                \"balloonText\": \"[[value]] post en [[category]] por [[title]]\",\n" +
"                                                                \"bullet\": \"round\",\n" +
"                                                                \"id\": \"179901595397349\",\n" +
"                                                                \"title\": \"CDDV - Comunidad Dominicana de Desarrolladores de Videojuegos\",\n" +
"                                                                \"type\": \"smoothedLine\",\n" +
"                                                                \"valueField\": \"column-179901595397349\"\n" +
"                                                            }\n" +
"                                                    ],\n" +
"                                                    \"guides\": [],\n" +
"                                                    \"valueAxes\": [\n" +
"                                                            {\n" +
"                                                                    \"id\": \"ValueAxis-1\",\n" +
"                                                                    \"title\": \"Publicaciones\"\n" +
"                                                            }\n" +
"                                                    ],\n" +
"                                                    \"allLabels\": [],\n" +
"                                                    \"balloon\": {},\n" +
"                                                    \"legend\": {\n" +
"                                                            \"useGraphSettings\": true\n" +
"                                                    },\n" +
"                                                    \"titles\": [\n" +
"                                                            {\n" +
"                                                                    \"id\": \"Title-1\",\n" +
"                                                                    \"size\": 15,\n" +
"                                                                    \"text\": \"Gráfica de actividad mes por mes de las publicaciones creadas en los distintos grupos de desarrollo\"\n" +
"                                                            }\n" +
"                                                    ],\n" +
"                                                    \"dataProvider\": [\n";
            
            String monthNameTemp = "";
            int counter = 0;
            for(GraphPostsStat graph : getPostsStats()){
                if(!monthNameTemp.equals(graph.getMonths())){
                    if(counter==0)
                        html +="{";
                    else{
                        html +="},{";
                    }
                }

                html += "'category': '"+graph.getMonths()+" "+ graph.getYears()+"',\n";
                html += "'"+graph.getGroupColumnId()+"': "+graph.getAmount()+", \n";
                monthNameTemp = graph.getMonths();
                counter++;
            }
            html += "}";

            html += "            ]\n" +
                    "        }\n" +
                    "   );\n" +
                    "</script>";
        return html;
    }
    
}
